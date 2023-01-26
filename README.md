# Mathematical Operation Visualizer 
[TOC]
By Harkeerat Singh Sawhney

## Purpose

The main purpose, or goal of this program is that it allows the users to input a mathematical operation, and it would express that operations in the human readable form. This program allows the user to input variety of operations, and also add complex operations to them which is then visualized. Also the program allows you to customize the output, with different background colors and different colors for the fonts. Along with that the program allows user to download the output, as a PNG and save it on their device. 

## How to Run the Program
Open the terminal, and enter the directory of where the program is. Then enter the following code:	

```bash
$$ javac Main.java
$$ Main.java
```

Then a GUI should open where you can use it.

## How it Works

Once the program is started, it would then show a GUI where it contains certain elements which the user could utilized to get its tasks done. 

### Features in GUI:

#### Input Area

- **Input Field:** In this field, the user can input the mathematical operation, which the user wished to get visualized. 
- **Evaluate Button:** When clicked on this button, whatever is inside the *input area* would be taken and then evaluated, when would then be shown in the output field

#### Output Area

- It is an **open** and **large** space at which the human readable form of the mathematical operations would be shown. 

#### Menu Bar

- **File:** It contains two buttons. One is *<u>Download Image</u>* which would download whatever is inside the *input field* and download it as PNG. Another button is *<u>Help</u>* which would open another windows, at which there would be few inputs which could help the user cruise through the program.
- **Edit:** This contains sever options, from which could be used to customize the *input field*. The background color, or the font color could be changed depending on the user's preferences. 

## Instructions

In order for to user to use the program properly, there are indeed few things which the user has to be careful of. Firstly is, that this program does not support decimal numbers. This program could only represent whole number (both positive and negative numbers). If some by chance the program crashes, or outputs an error then simply restart the program. Another key point, to take care of is that there is limited amount of operations which are supported. Operators such as "=" aren't supported, and would lead to the program crashing. 

## Supported Operators

Bellow is the list of all the supported operator which the program can represent (examples bellow are the inputs):

1. **Literals** (eg. *1*)
2. **Variables** (eg. *x*)
3. **Addition** (eg. *1+1*)
4. **Subtraction** (eg. *1-1*)
5. **Multiplication** (eg. *1*1*)
6. **Division** (eg. *1/1*)
7. **Modulus** (eg. *1%1*)
8. **Greater** (eg. *1<2*)
9. **Smaller** (eg. *2>1*)
10. **Exponent** (eg. *1^2*)
11. **sin** (eg. *sin(x)*)
12. **cos** (eg. *cos(x)*)
13. **tan** (eg. *tan(x)*)
14. **ln** (eg. *ln(x))*
15. **inverse** (eg. *sin^-1(2)*)

## PMD and CPD Violations

From the mvn check, there are indeed some Violations. One of those violations which repeats a lot is the violations of duplication. This violations exists, because many times same code is used to style the buttons, or to just have systematic structure in the code. For instance in the Help method there tends to be a lot of duplication of code as because there had to be a systemic order, so that it easy to read and follow. This problem could be avoided if sub-classes are made where  such code is actually called upon, rather then being repeating. This would improve the performance and would make it much more efficient as well.

## Future Scope

There is indeed a lot of scope for this program. In future for instance the division line could be actually made horizontal. Also along with that the actuall calculation could be done for the program, where it also shows the result of the input. It would have been realized that a class called as *draw* is actually not that usefully. However, that class is kept for the improvements in the future, as this class could be used to implement those features. Along with that more customization would also be appreciated as well in the future updated. 
