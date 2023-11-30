/*Assigment Solution 
 * 
 * Question 1 : What are the conditional operator in java?
 * Answer 1: In Java, conditional operators check the condition and decides the desired result on the basis of both conditions. 
 * There are three types of the conditional operator in Java:
        Logical AND
        Logical OR
        Ternary Operator
    1. Conditional AND: The operator is applied between two Boolean expressions. It is denoted by the two AND operators (&&). It returns true if and only if both expressions are true, else returns false.
 *  2. Conditional OR:The operator is applied between two Boolean expressions. It is denoted by the two OR operator (||). It returns true if any of the expression is true, else returns false.
 *  3. Ternary Operator: The meaning of ternary is composed of three parts. The ternary operator (? :) consists of three operands. It is used to evaluate Boolean expressions. The operator decides which value will be assigned to the variable. It is the only conditional operator that accepts three operands. It can be used instead of the if-else statement. It makes the code much more easy, readable, and shorter.
 *          Synatx: variable = (condition) ? expression1 : expression2
 * Questio 2: What are the types of operators based on the number of operands ?
 * Anwser 2:  Operators in programming languages can be categorized based on the number of operands they operate on. Here are the main categories:
    Unary Operators: Operate on a single operand.
        Examples:
            Unary plus (+)
            Unary minus (-)
            Logical NOT (!)
            Increment (++), Decrement (--)
    Binary Operators: Operate on two operands.
        Examples:
            Addition (+)
            Subtraction (-)
            Multiplication (*)
            Division (/)
            Modulus (%)
            Assignment (=)
            Comparison operators (==, !=, >, <, >=, <=)
            Logical operators (&&, ||)
    Ternary Operator: Operates on three operands.The only ternary operator in most programming languages is the conditional (or ternary) operator, denoted by "?:".
 * Question 3: What is the use of Switch case in java programming?
 * Answer 3: The Java switch statement executes one statement from multiple conditions. It is like an if-else-if ladder statement. It provides an easy way to dispatch execution to different parts of code based on the value of the expression. Basically, the expression can be a byte, short, char, or int primitive data types. It basically tests the equality of variables against multiple values.
 *        Note: Java switch expression must be of byte, short, int, long(with its Wrapper type), enums and string. Beginning with JDK7, it also works with enumerated types (Enums in java), the String class, and Wrapper classes.
 * Question 4: what are the priority levels of arithmetic operators in java?
 * Answer 4: In Java, arithmetic operators have different priority levels, and they follow the order of operations (also known as operator precedence). Here is a list of arithmetic operators in Java, ordered by their priority from highest to lowest:
    Postfix operators:
        expr++ (post-increment)
        expr-- (post-decrement)
    Unary operators:
        ++expr (pre-increment)
        --expr (pre-decrement)
        +expr (unary plus)
        -expr (unary minus)
        ~expr (bitwise NOT)
        !expr (logical NOT)
    Multiplicative operators:
        * (multiplication)
        / (division)
        % (modulo)
    Additive operators:
        + (addition)
        - (subtraction)
    Shift operators:
        << (left shift)
        >> (right shift with sign extension)
        >>> (right shift with zero extension)
    Relational operators:
        < (less than)
        > (greater than)
        <= (less than or equal to)
        >= (greater than or equal to)
        instanceof (type comparison)
    Equality operators:
        == (equal to)
        != (not equal to)
    Bitwise AND:
        &
    Bitwise XOR:
        ^
    Bitwise OR:
        |
    Logical AND:
        &&
    Logical OR:
        ||
    Conditional (Ternary) Operator:
        ? :
    Assignment operators:
    =, +=, -=, *=, /=, %=, &=, |=, ^=, <<=, >>=, >>>=
 * Question 5: What are the conditional Statements and use of conditional statements in Java ?
 * Answer 5: Conditional statements in Java are the executable block of code (or branch to a specific code) dependent on certain conditions. These statements are also known as decision statements or selection statements in Java.
    Following are the statements covered under conditional statements in Java:
        If statement
        If else statement
        Switch Statement
            If Statement: If a statement executes a set of statements based upon certain conditions. The condition statement follows the if keyword. 
            Syntax:
            if (condition)
            {
            //Statements to be executed
            }

        If-Else Statement:If-Else statement is a control structure that selects or chooses a set of statements depending upon certain conditions.If statements are like a subset of if-else statements.
            Syntax:
            if (condition)
            {
            //Statements to be executed if condition satisfies
            }
            else
            {
            //Statements to be executed if the condition is not satisfied
            }

        Nested If-Else Statements:The nested if-else statements are statements that incorporate more than one if-else clause. 
            Syntax:
            if (condition)
            {
            //Statements set 1
            }
            else if (condition 2) 
            { 
            //Statements set 2
            }
            . . .
            else
            {
            //Statements to be executed if no condition is satisfied.
            }

        Switch Statement: Unlike the if-else statement, the switch has multiple paths of execution. Moreover, it evaluates the expression based on some of the primitive types or class types and matches their value with its cases. A switch can work well with a byte, char, short, and int primitive data types.
            Syntax: 
            switch (Expression)
            {
            case value 1: Statement 1;
            case value 2: Statement 2;
            case value 3: Statement 3;
            .
            .
            .
            case value n: Statement n;
            Default: default statement;
            } 

 * Question 6: What is the syntax of if else statment?
 * Answer 6: If-Else Statement:If-Else statement is a control structure that selects or chooses a set of statements depending upon certain conditions.If statements are like a subset of if-else statements.
            Syntax:
            if (condition)
            {
            //Statements to be executed if condition satisfies
            }
            else
            {
            //Statements to be executed if the condition is not satisfied
            }

 * Question 7: What are the 3 types of iterative statements in java?
 * Answer 7: Iteration statements are also called as looping statements. By default all statements are executed sequentially in java program. Iteration statements are used to repeat the statements until specified condition is met.
            In Java, we have the following looping statements:
                while   
                do...while  
                for   
                for-each 
            
 * Question 8: Write the difference between for loop and do-while loop in java?
 * Answer 8: For loop:   Statement(s) is executed once the condition is checked.
			It might be that statement(s) gets executed zero times.	
			For the single statement, bracket is not compulsory.	
			Initialization may be outside or in condition box.	
			for loop is entry controlled loop.	
			for ( init ; condition ; iteration )
			{ 
			statement (s); 
			}	

Do-While loop: 	Condition is checked after the statement(s) is executed.
				Statement(s) is executed at least once.
				Brackets are always compulsory.
				Initialization may be outside or within the loop.
				do-while is exit controlled loop.
				do { 
				statement(s); 
				}
				while (condition);

 * Question 9: Write a program to print number from 1 to 10?
 * Answer 9 : Below this  
 */
class Number {
    public static void main(String args[]) {
        int i = 1;
        for (i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}