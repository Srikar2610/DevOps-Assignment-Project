DEMO
package com.app  
class Demo {  
static void main(args) {  
print("Welcome to Javatpoint tutorial on Groovy... ")  
}  
} 

Operators
Arithmetic operators

package com.app  
class GroovyOperatorsExample1 {  
static void main(args) {  
        int a = 10  
        int b = 5  
        int c  
        c = a + b  
        println "Addition = " + c  
        c = a - b  
        println "Subtraction = " + c  
        c = a * b  
        println "Multiplication = " + c  
        c = a / b  
        println "Division = " + c  
        c = a % b  
        println "Remainder  = " + c  
        c = a ** b  
        println "Power = "+c  
        }  
}  

Unary operators

package com.app  
class GroovyOperatorsExample4 {  
static void main(args) {  
        int a = 10  
        int c  
        c = a++  
        println "Post Increment = " + c  
        println "Value of a after Post Increment = " + a  
        c = ++a  
        println "Pre Increment = " + c  
        println "Value of a after Pre Increment = " + a  
        int b = 10  
        c = b--  
        println "Post decrement = " + c  
        println "Value of a after Post decrement = " + b  
        c = --b  
        println "Pre decrement = " + c  
        println "Value of a after Pre decrement = " + b  
        }  
}  

Assignment arithmetic operators

package com.app  
class GroovyOperatorsExample5 {  
static void main(args) {  
        int a = 10  
        a+=3  
        println "a+=3 ------> " + a  
        a-=3  
        println "a-=3 ------> " + a  
        a*=3  
        println "a*=3 ------> " + a  
        a/=3  
        println "a/=3 ------> " + a  
        a%=3  
        println "a%=3 ------> " + a  
        a**=3  
        println "a**=3 ------> " + a  
        }  
}  

Relational operators

package com.app  
class GroovyOperatorsExample6 {  
static void main(args) {  
        int a = 10  
        int b = 12  
        boolean c  
        println "a = 10"  
        println "b = 12"  
        c = a == b  
        println "Relational Operator equals [c = a == b] ----> " + c  
        c = a != b  
        println "Relational Operator different [c = a == b] ----> " + c  
        c = a < b  
        println "Relational Operator less than [c = a < b] ----> " + c  
        c = a <= b  
        println "Relational Operator less than equal to [c = a <= b] ----> " + c  
        c = a > b  
        println "Relational Operator greater than [c = a > b] ----> " + c  
        c = a >= b  
        println "Relational Operator greater than equal to [c = a >= b] ----> " + c  
          
        }  
}  

Logical operators
package com.app  
class GroovyOperatorsExample7 {  
static void main(args) {  
        boolean c  
        c = true && true  
        println "Logical AND operator = " + c  
        c = true || false  
        println "Logical OR operator = " + c  
        c = !false  
        println "Logical NOT operator = " + c  
          
        }  
}  

Bitwise operators

package com.app  
class GroovyOperatorsExample10 {  
      
    static void main(args) {  
        int a = 0b00101111  
        println "a = 0b00101111 ----> "+a   
        int b = 0b000010101  
        println "b = 0b000010101 ----> "+b   
        println "(a & a) ----> "+(a & a)   
        println "(a & b) ----> "+(a & b)   
        println "(a | a) ----> "+(a | a)   
        println "(a | a) ----> "+(a | b)   
          
        int c = 0b11111111  
        println "c = 0b11111111"  
        println "((a ^ a) & c) ----> "+((a ^ a) & c)   
        println "((a ^ b) & c) ----> "+((a ^ b) & c)   
        println "((~a) & c) ----> "+((~a) & c)      
    }  
}  

Conditional operators

package com.app  
class GroovyOperatorsExample12 {  
static void main(args) {  
        println "(!true) ----> "+(!true)      
        println "(!'javatpoint') ----> "+(!'javatpoint')    
        println "!Null ----> "+(!'')   
    }  
}  

