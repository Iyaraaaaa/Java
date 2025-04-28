import javax.swing.JOptionPane;
public class calculator{

    public static void main (String[] args){
         while(true){
                String x=JOptionPane.showInputDialog(null,"Enter First Number 01:");
                    String y=JOptionPane.showInputDialog(null,"Enter second Number 02:");

                int a=Integer.parseInt(x);
                int b=Integer.parseInt(y);

                String z =JOptionPane.showInputDialog(null,
                 "Enter 1 if you want to addition"+"\n"
                +"Enter 2 if you want to substraction"+"\n"
                +"Enter 3 if you want to Multify"+"\n"
                +"Enter 4 if you want to Divide"+"\n"
                +"Enter 0 if you want to Exit"
                 );

            int c=Integer.parseInt(z);

                    if(c==1){
                        JOptionPane.showMessageDialog(null,a+b);
                    }else if(c==2){
                        JOptionPane.showMessageDialog(null,a-b);
                    }else if(c==3){
                        JOptionPane.showMessageDialog(null,a*b);
                    }else if(c==4){
                        JOptionPane.showMessageDialog(null,a/b);
                    }else{
                        System.exit(0);
                        }
        }
    }
}