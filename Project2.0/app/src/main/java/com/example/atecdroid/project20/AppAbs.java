package com.example.atecdroid.project20;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

import modelo.Linguagem;
import modelo.Tutorial;
import modelo.User;

/**
 * Created by atecdroid on 7/28/16.
 */
public class AppAbs extends AppCompatActivity
{
    // root
    User root = new User("root", "pass", "Pedro", "Lopes");

    //TUtorias carregados supostamente da base de dados
    //Java
    Tutorial java1, java2;
    // Python
    Tutorial python1, python2;
    // C++
    Tutorial cpp1, cpp2;
    // PHP
    Tutorial php1, php2;
    //-------------------------------------------------------------------
    // codigo html para mostrar nas webviews
    //-------------------------------------------------------------------
    String java1HTML = "<!DOCTYPE html>\n" +
            "<html>\n" +
            "\t<head>\n" +
            "\t\t<title></title>\n" +
            "\t\t<meta charset=\"utf-8\">\n" +
            "\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
            "\t</head>\n" +
            "\t<body>\n" +
            "\t\t<h2>Text Formatting in Java</h2>\n" +
            "\t\t<p>To create your first application in java all you have to do is to type the following code:</p>\n" +
            "\t\t<code>\n" +
            "\t\t\tclass HelloWorldApp {<br>\n" +
            "\t\t\t   &nbsp;public static void main(String[] args) {<br>\n" +
            "\t\t\t       &nbsp;&nbsp;System.out.println(\"Hello World!\"); // Display the string.<br>\n" +
            "\t\t\t   &nbsp;}<br>\n" +
            "\t\t\t}\n" +
            "\t\t</code>\n" +
            "\t</body>\n" +
            "</html>";
    String java2HTML = "<!DOCTYPE html>\n" +
            "<html>\n" +
            "\t<head>\n" +
            "\t\t<title></title>\n" +
            "\t\t<meta charset=\"utf-8\">\n" +
            "\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
            "\t</head>\n" +
            "\t<body>\n" +
            "\t\t<h2>Text Formatting in Java</h2>\n" +
            "\t\t<p>Learn how to format your output text.</p>\n" +
            "\t\t<b>\\n</b> - New line<br>\n" +
            "\t\t<b>\\t</b> - Adds a Tab<br><br>\n" +
            "\t\t<b>Example:</b><br>\n" +
            "\t\tSystem.out.printf(\"\\nHello World!\");\n" +
            "\t</body>\n" +
            "</html>";
    String python1HTML = "<!DOCTYPE html>\n" +
            "<html>\n" +
            "\t<head>\n" +
            "\t\t<title></title>\n" +
            "\t\t<meta charset=\"utf-8\">\n" +
            "\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
            "\t</head>\n" +
            "\t<body>\n" +
            "\t\t<h2>Hello World in Python</h2>\n" +
            "\t\t<p>It's pretty simple to create your first program using Python. Try pasting the following code in your console:</p>\n" +
            "\t\t<b>>>></b> print(\"Hello, World!\")<br>\n" +
            "\t\t<p>You can now save the code in a .py file to execute it if you want.</p>\n" +
            "\t</body>\n" +
            "</html>";
    String python2HTML = "<!DOCTYPE html>\n" +
            "<html>\n" +
            "\t<head>\n" +
            "\t\t<title></title>\n" +
            "\t\t<meta charset=\"utf-8\">\n" +
            "\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
            "\t</head>\n" +
            "\t<body>\n" +
            "\t\t<h2>Calculations in Python</h2>\n" +
            "\t\t<p>It's very easy to do calculations in python. You can type directly in the python console, for example:</p>\n" +
            "\t\t<b>>>></b>5 + 7<br>\n" +
            "\t\t12\n" +
            "\t\t<p>You can now save the code in a .py file to execute it if you want.</p>\n" +
            "\t\t<p>Example of a file:</p>\n" +
            "\t\ta = 5<br>\n" +
            "\t\tb = 7<br>\n" +
            "\t\tresult = a + b<br>\n" +
            "\t\tprint(result)\n" +
            "\t</body>\n" +
            "</html>";
    String cpp1HTML = "<!DOCTYPE html>\n" +
            "<html>\n" +
            "<head>\n" +
            "\t<title></title>\n" +
            "\t<meta charset=\"utf-8\">\n" +
            "\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
            "</head>\n" +
            "<body>\n" +
            "\t<h2>C++ Tutorial #1</h2>\n" +
            "\tHow to make an \"Hello world\" in C++.\n" +
            "\t<br>\n" +
            "\tPaste the code bellow in your c++ file.\n" +
            "\t<br>\n" +
            "\t<br>\n" +
            "\t<code>\n" +
            "\t\t#include &lt;iostream&gt;<br>\n" +
            "\t\t<br>\n" +
            "\t\tint main()<br>\n" +
            "\t\t{<br>\n" +
            "\t\t  &nbsp;std::cout << \"Hello World!\";<br>\n" +
            "\t\t}<br>\n" +
            "\t</code>\n" +
            "\t<br>\n" +
            "\tAnd that's how you do your first program in c++.\n" +
            "</body>\n" +
            "</html>";
    String cpp2HTML = "<!DOCTYPE html>\n" +
            "<html>\n" +
            "<head>\n" +
            "\t<title></title>\n" +
            "\t<meta charset=\"utf-8\">\n" +
            "\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
            "</head>\n" +
            "<body>\n" +
            "\t<h2>C++ Tutorial #1</h2>\n" +
            "\tHow to sum 2 numbers in C++.\n" +
            "\t<br>\n" +
            "\t<br>\n" +
            "\t<code>\n" +
            "\n" +
            "\t#include &lt;stdio.h&gt;<br>\n" +
            " \t<br>\n" +
            "\tint main()<br>\n" +
            "\t{<br>\n" +
            "\t   int a, b, c;<br>\n" +
            "\t <br>\n" +
            "\t   printf(\"Enter two numbers to add\\n\");<br>\n" +
            "\t   scanf(\"%d%d\",&a,&b);<br>\n" +
            "\t <br>\n" +
            "\t   c = a + b;<br>\n" +
            "\t <br>\n" +
            "\t   printf(\"Sum of entered numbers = %d\\n\",c);<br>\n" +
            "\t <br>\n" +
            "\t   return 0;<br>\n" +
            "\t}<br>\n" +
            "\t</code>\n" +
            "\t<br>\n" +
            "\tEasy tutorial on how to add 2 numbers.\n" +
            "</body>\n" +
            "</html>";
    String php1HTML = "<!DOCTYPE html>\n" +
            "<html>\n" +
            "<head>\n" +
            "\t<title></title>\n" +
            "\t<meta charset=\"utf-8\">\n" +
            "\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
            "</head>\n" +
            "<body>\n" +
            "\t<h2>PHP Tutorial #1</h2>\n" +
            "\tHow to make an \"Hello world\" in PHP.\n" +
            "\t<br>\n" +
            "\tWhat you have to do, is basically to open your php file and paste the code bellow.\n" +
            "\t<br>\n" +
            "\t<br>\n" +
            "\t<code>\n" +
            "\t\t &lt;?php echo 'Hello World';?&gt;\n" +
            "\t</code>\n" +
            "\t<br>\n" +
            "\t<br>\n" +
            "\tAnd that's how you can make you first 'program' in php.\n" +
            "</body>\n" +
            "</html>";
    String php2HTML = "<!DOCTYPE html>\n" +
            "<html>\n" +
            "<head>\n" +
            "\t<title></title>\n" +
            "\t<meta charset=\"utf-8\">\n" +
            "\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
            "</head>\n" +
            "<body>\n" +
            "\t<h2>PHP Tutorial #2</h2>\n" +
            "\tHow to sum two numbers in PHP.\n" +
            "\t<br>\n" +
            "\tIn the code b ellow, we will show you how to sum 2 numbers.\n" +
            "\t<br>\n" +
            "\t<br>\n" +
            "\t<code>\n" +
            "\t\t&lt;?php\n" +
            "\t\t<br>\n" +
            "\t\t&nbsp;$first_number = 10;<br>\n" +
            "\t\t&nbsp;$second_number = 20;<br>\n" +
            "\t\t&nbsp;$sum = $first_number + $second_number;<br>\n" +
            "\t\t<br>\n" +
            "\t\t&nbsp;echo $first_number . \" + \" . $second_number . \" = \" . $sum;<br>\n" +
            "\t\t?&gt;\n" +
            "\t</code>\n" +
            "\t<br>\n" +
            "\t<br>\n" +
            "\tThe result of the echo line is:<br>\n" +
            "\t<br>\n" +
            "\t&nbsp;&nbsp;&nbsp;10 + 20 = 30\n" +
            "\t<br>\n" +
            "\t<br>\n" +
            "</body>\n" +
            "</html>";

    ArrayList<Linguagem> linguagens = new ArrayList<Linguagem>();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        linguagens.add(new Linguagem("Java", "A programmer had a problem. He decides to use Java. He now has a ProblemFactory (pun)", "0.0.1"));
        linguagens.add(new Linguagem("Python", "Python é a evolução final do Java", "0.0.1"));
        linguagens.add(new Linguagem("C++", "C++ é o arquiteto do matrix", "99.99.1"));
        linguagens.add(new Linguagem("PHP", "Quando a vida parecer confusa, programa em PHP. A tua vida vai se tornar simples.", "0.0.1"));

        //PREPARAR ESTA TRALHA TODA
        java1 = new Tutorial(java1HTML, "Java Tutorial #1", "Pedro ROlo");
        java2 = new Tutorial(java2HTML, "Java Tutorial #2", "Sandromix");
        // Python
        python1 = new Tutorial(python1HTML, "Python Tutorial #1", "Pedro ROlo");
        python2 = new Tutorial(python2HTML, "Python Tutorial #2", "Pedro ROlo");
        // C++
        cpp1 = new Tutorial(cpp1HTML, "C++ Tutorial #1", "Pedro ROlo");
        cpp2 = new Tutorial(cpp2HTML, "C++ Tutorial #2", "Pedro ROlo");
        // PHP
        php1 = new Tutorial(php1HTML, "PHP Tutorial #1", "Pedro ROlo");
        php2 = new Tutorial(php2HTML, "PHP Tutorial #2", "Pedro ROlo");

        (linguagens.get(0)).addElement(java1);
        (linguagens.get(0)).addElement(java2);
        (linguagens.get(1)).addElement(python1);
        (linguagens.get(1)).addElement(python2);
        (linguagens.get(2)).addElement(cpp1);
        (linguagens.get(2)).addElement(cpp2);
        (linguagens.get(3)).addElement(php1);
        (linguagens.get(3)).addElement(php2);
    }






    // objetos para linguagens
    //Linguagem java = new Linguagem("Java", "Java é uma linguagem que serve para tirar cafés e mais nada", "0.0.1", )


}
