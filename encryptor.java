import java.util.Scanner;

public class encryptor {

    static void Encript() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number Want To Encrypt:");
        String message = sc.nextLine();
        char arr[] = new char[message.length()];
        for (int i = 0; i < message.length(); i++) {
            arr[i] = message.charAt(i);
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '1') {
                arr[i] = '%';
            }
            else if (arr[i] == '2') {
                arr[i] = '#';
            }
            else if (arr[i] == '3') {
                arr[i] = '!';
            } else if (arr[i] == '4') {
                arr[i] = ')';
            } else if (arr[i] == '5') {
                arr[i] = '?';
            } else if (arr[i] == '6') {
                arr[i] = '.';
            }
            else if (arr[i] == '7') {
                arr[i] = '-';
            }
            else if (arr[i] == '8') {
                arr[i] = 1;
            }
            else if (arr[i] == '9') {
                arr[i] = '(';
            } else if (arr[i] == '0') {
                arr[i] = ',';
            }

        }
for(int i=0;i<arr.length;i++){
        System.out.print(" "+arr[i]);}
        System.out.println();

    }

    static void Decript() {
        Scanner sc = new Scanner(System.in);
        String message = sc.nextLine();

        char arr[] = new char[message.length()];

        for (int i = 0; i < message.length(); i++) {
            arr[i] = message.charAt(i);
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '%') {
                arr[i] = '1';
            }

            else if (arr[i] == '#') {
                arr[i] = '2';
            }

            else if (arr[i] == '!') {
                arr[i] = '3';
            } else if (arr[i] == ')') {
                arr[i] = '4';
            } else if (arr[i] == '?') {
                arr[i] = '5';
            } else if (arr[i] == '.') {
                arr[i] = '6';
            }

            else if (arr[i] == '-') {
                arr[i] = '7';
            }

            else if (arr[i] == '1') {
                arr[i] = 8;

            }

            else if (arr[i] == '(') {
                arr[i] = '9';
            } else if (arr[i] == ',') {
                arr[i] = '0';
            }
        }
for(int i=0;i<arr.length;i++){
        System.out.print( ""+arr[i]);}
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        String message;
        do {

            System.out.print("1:Encript\n2:Decript\n");
            a = sc.nextInt();
            switch (a) {
                case 1:
                    Encript();
                    break;

                case 2:
                    Decript();
                    break;
            }
        } while (a != 0);
    }
}
