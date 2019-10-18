package eg.edu.alexu.csd.oop.calculator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Function implements Calculator {

    double num1;
    double num2;
    String Maths="";
    String operation ="";
    //LinkedList<String> Array_save=new LinkedList ();
    public static Stack<String> input=new Stack();
    public static Stack<String> input2=new Stack();
    Function(){
        input.clear();
        input2.clear();
    }
    private Boolean flag =false;
    public final static int j=input.size();
    public static int y=j;
    public void input(String s)
    {
    	s=s.replace(" ", "");
        String pattern= "^(\\-?\\d+\\.?\\d*)([\\+\\-\\*\\/]{1})(\\-?\\d+\\.?\\d*?)$";
        Pattern help = Pattern.compile(pattern);
        Matcher A=help.matcher(s);
        if(A.find())
        {
            num1=Double.valueOf(A.group(1));
            num2=Double.valueOf(A.group(3));
            Maths=A.group(2);
            if (!flag) {
                while (!input2.empty())
                    input.push(input2.pop());
                Stack<String> Temp = new Stack<>();
                if (input.size() >= 5) {
                    while (!input.empty() && Temp.size() < 4)
                        Temp.push(input.pop());
                    input.clear();
                    while (!Temp.empty())
                        input.push(Temp.pop());
                }
                input.push(s);
                System.out.print("Input is ");
                System.out.println(input);
            }
            else flag = false;
        }
    }

    private static String makeup (double x1,double x2,String Maths)
    {
        double ans11 = 0;
        if(Maths.equals("-"))
        {
            ans11= x1-x2;
        }
        else if(Maths.equals("+"))
        {
            ans11= x1+x2;
        }
        else if(Maths.equals("*"))
        {
            ans11= x1*x2;
        }
        else if(Maths.equals("/"))
        {
            if(x2!=0.0)
            {
                ans11= x1/x2;
            }
            else
            {
                JFrame parent = new JFrame();
                JOptionPane.showMessageDialog(parent, "Cannot divide by zero‬");
            }
        }
        else
        {
            return "";
        }


        return String.valueOf(ans11);
    }

    public String getResult()
    {
        String value=makeup (num1,num2, Maths);
		/* if(value !="")
		 {
			 String x=""+num1+" "+Maths+" "+num2;
			 input.push(x);
		 }*/
        return value;
    }

    public String current ()
    {
        try {
            System.out.println("Current Pressed");
            System.out.print("Input was : ");
            System.out.println(input);
            System.out.print("Input2 was : ");
            System.out.println(input2);
            if (input.size() == 0) {
                System.out.print("Input : ");
                System.out.println(input);
                System.out.print("Input2 : ");
                System.out.println(input2);
                return input2.peek();
            } else {
                System.out.print("Input : ");
                System.out.println(input);
                System.out.print("Input2 : ");
                System.out.println(input2);
                return input.peek();
            }
        }
        catch (Exception e){
            return null;
        }
    }

    public String prev()
    {
        System.out.println("Previous Pressed");
        System.out.print("Input was : ");
        System.out.println(input);
        System.out.print("Input2 was : ");
        System.out.println(input2);

//        if(j-5<y)
//        {
        System.out.print("Input size equals ");
        System.out.println(input.size());
        try {
            if (input.size() != 0) {
                String x = input.pop();
                input2.push(x);
//                y--;
                System.out.print("Input : ");
                System.out.println(input);
                System.out.print("Input2 : ");
                System.out.println(input2);
                flag = true;
                input(input.peek());
                return input.peek();
            }
        }
        catch (Exception e){
            return null;
        }
//        else
//        {
//				/* JFrame parent = new JFrame();
//	    		 JOptionPane.showMessageDialog(parent, "The Stack is Empty‬");
//	    		 return input2.peek(); */
//            System.out.print("Input : ");
//            System.out.println(input);
//            System.out.print("Input2 : ");
//            System.out.println(input2);
//            return null;
//        }
//        }
//        else
//        {
//            System.out.print("Input : ");
//            System.out.println(input);
//            System.out.print("Input2 : ");
//            System.out.println(input2);
//            return null;
//			/* JFrame parent = new JFrame();
//    		 JOptionPane.showMessageDialog(parent, "The Stack is Empty‬");
//    		 return input2.peek();*/
//        }
        return null;
    }
    public String next()
    {
        System.out.println("Next Pressed");
        System.out.print("Input was : ");
        System.out.println(input);
        System.out.print("Input2 was : ");
        System.out.println(input2);
//        if(y<j)
        {
            Stack<String> Temp = new Stack<>();
            int Size =1;
            while(!input.empty()) {
                Temp.push(input.pop());
                Size++;
            }
            System.out.print("Size ");
            System.out.println(Size);
            while (!Temp.empty()){
                input.push(Temp.pop());
            }
           /* if (Size==4){
                input.push(input2.pop());
                return input.peek();
            } */
            if((input.size()==0)&&(input2.size()!=0))
            {
            	String x = input2.pop();
                input.push(x);
                input.push(input2.pop());
                return input.peek();   
            }
            else 
            {
            	try {
                    if (input2.size() != 0) {
                        String x = input2.pop();
                        input.push(x);
//                    y++;
                        System.out.print("Input : ");
                        System.out.println(input);
                        System.out.print("Input2 : ");
                        System.out.println(input2);
                        return input.peek();
                    }
                }
                catch (Exception e){
                    return null;
                }
            }
            
//            else
//            {
//                System.out.print("Input : ");
//                System.out.println(input);
//                System.out.print("Input2 : ");
//                System.out.println(input2);
//                return null;
				 /*JFrame parent = new JFrame();
	    		 JOptionPane.showMessageDialog(parent, "This Is The Last operation");
	    		 return input.peek();*/
//            }

        }
//        else
//        {
//            System.out.print("Input : ");
//            System.out.println(input);
//            System.out.print("Input2 : ");
//            System.out.println(input2);
//            return null;
//			 /*
//			 JFrame parent = new JFrame();
//    		 JOptionPane.showMessageDialog(parent, "This Is The Last operation");
//    		 return input.peek();*/
//        }
        return null;
    }

    public void save()
    {
        try
        {
            FileWriter Folder=new FileWriter("Operation.txt");
            PrintWriter print=new PrintWriter(Folder);
           
            int y=input.size();
            
            for(int i=0;i<5;i++)
            {
                if(y!=0)
                {
                    String x=input.get(y-1);
                    print.println(x);
                    y--;
                    //input2.push(x);
                } 
            }
            print.close();
            
            FileWriter Folder1=new FileWriter("Operation1.txt");
            PrintWriter print1=new PrintWriter(Folder1);
            int z=input2.size();
            for(int i=0;i<5;i++)
            {
                if(z!=0)
                {
                    String x=input2.get(z-1);
                    print1.println(x);
                    z--;
                    //input2.push(x);
                } 
            }
            print1.close();
        }
        catch(IOException e)
        {
            System.out.println("Error!");
        }

    }
    public void load()
    {
        input.clear();
        input2.clear();
        Stack<String> input3=new Stack();
        try
        {
            FileReader Folder=new FileReader("Operation.txt");
            BufferedReader Read=new BufferedReader(Folder);
            String operation ;
            
            while((operation=Read.readLine())!=null)
            {
                input3.push(operation);
            }
            int x=input3.size();
            for(int i=0;i<x;i++)
            {
                input.push(input3.pop());
            }
            Read.close();
            
            FileReader Folder1=new FileReader("Operation1.txt");
            BufferedReader Read1=new BufferedReader(Folder1);
            String operation1 ;
            while((operation1=Read1.readLine())!=null)
            {
                input3.push(operation1);
            }
            int t=input3.size();
            for(int i=0;i<t;i++)
            {
                input2.push(input3.pop());
            }
            Read1.close();
        }

        catch(IOException e)
        {
            System.out.println("File not found !");
        }

    }

}