/**
 * Copyright 2006 The Apache Software Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.hadoop.examples;
import org.apache.hadoop.util.ProgramDriver;

public class ExampleDriver {
  
  /**
   * A description of an example program based on its class and a 
   * human-readable description.
   * @author Owen O'Malley
   * @date april 2006
   */
    
    public static void main(String argv[]){
        ProgramDriver pgd = new ProgramDriver();
        try {
	    pgd.addClass("wordcount", WordCount.class, 
			 "A map/reduce program that counts the words in the input files.");
	    pgd.addClass("grep", Grep.class, 
			 "A map/reduce program that counts the matches of a regex in the input.");
	    pgd.driver(argv);
	}
	catch(Throwable e){
	    e.printStackTrace();
	}
    }
}
	
