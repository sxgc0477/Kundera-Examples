/*******************************************************************************
 * * Copyright 2012 Impetus Infotech.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *      http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 ******************************************************************************/
package com.impetus.kundera.examples.crossdatastore.pickr;

import com.impetus.kundera.examples.crossdatastore.pickr.dao.Pickr;
import com.impetus.kundera.examples.crossdatastore.pickr.dao.PickrImpl;

/**
 * @author amresh.singh
 *
 */
public abstract class PickrBaseTest
{
    Pickr pickr;
    int photographerId;

    
    protected void setUp() throws Exception
    {
        photographerId = 1;
        pickr = new PickrImpl("piccandra");
    }

    public void test()
    {       
               
    }
    
    protected void tearDown() throws Exception
    {
        pickr.close();
    }
    
    protected abstract void addPhotographer();
    protected abstract void updatePhotographer();
    protected abstract void getPhotographer();
    protected abstract void getAllPhotographers();
    protected abstract void deletePhotographer();
    
}
