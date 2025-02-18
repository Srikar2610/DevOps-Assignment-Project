DECISION MAKING
IF statement

package com.app  
  
class GroovyDecisionMakingExample1 {  
  
    static void main(args) {  
        int a = 10  
        if (a<50) {  
         println("javatpoint");  
      }            
    }  
}  

IF-ELSE statement
package com.app  
class GroovyDecisionMakingExample3 {  
    static void main(args) {  
         int a = 20   
      if (a<50) {   
         println("The value is less than 50");   
      } else {    
         println("The value is greater than 50");   
      }   
    }  
}

NESTED-IF statement
package com.app  
class GroovyDecisionMakingExample5 {  
    static void main(args) {  
          int a = 20  
      if (a>50) {  
         println("The value is less than 50");   
      } else   
      if (a>10) {   
         println("The value is greater than 10 and greater than 50");   
      } else {   
         println("The value of a is less than 10");   
      }    
    }  
}    

SWITCH statement
package com.app  
class GroovyDecisionMakingExample6 {  
    static void main(args) {  
         int a = 4  
      switch(a) {                         
         case 1:   
            println("Monday");   
            break;   
         case 2:   
            println("Tuesday");   
            break;   
         case 3:   
            println("Wednesday");   
            break;   
         case 4:   
            println("Thursday");   
            break;   
        case 5:  
            println("Friday");  
            break;  
        case 6:  
            println("Saturday");  
            break;  
         default:   
            println("Sunday");   
            break;   
      }  
    }  
}  

STRINGS
Single-Quoted string
package com.app  
class GroovyStringExample1 {  
static void main(args)  
{  
        String s1 = 'Javatpoint'  
        println s1  
        println 'This is tutorial on Groovy at ' + s1  
}  
}  

Double-Quoted string
package com.app  
class GroovyStringExample2 {  
static void main(args)  
{  
        String s1 = "Javatpoint"  
        println s1  
        println "This is tutorial on Groovy at " + s1  
}  
} 

Triple-Quoted string
package com.app  
class GroovyStringExample4 {  
static void main(args)  
{  
        String s1 = '''This is groovy tutorial and we are learning string'''  
        println s1  
}  
} 

package com.app  
class GroovyStringExample7 {  
static void main(args)  
{  
String s1 = """This is line 1  
This is line 2  
This is line 3  
This is line 4  
This is line 5"""  
        println s1  
}  
}  
