import java.io.BufferedReader;
import java.io.FileReader;
import pilas.StackADT;

public class Main {
    public static void main(String[] args) {
        //ruta del archivo
        String texto1 = "C:\\Users\\sigma\\OneDrive\\Documentos\\NetBeansProjects\\BalanceoParentesis\\src\\texto1.txt";
        String contentFile1 = readFileContent(texto1);
        boolean balancerFile1 = checkParenthesis(contentFile1);
        System.out.println("Texto1 " +   " Esta Balanceado?: " + balancerFile1);

        //ruta del archivo
        String texto2 = "C:\\Users\\sigma\\OneDrive\\Documentos\\NetBeansProjects\\BalanceoParentesis\\src\\texto2.txt";
        String contentFile2 = readFileContent(texto2);
        boolean balancerFile2 = checkParenthesis(contentFile2);
        System.out.println("Texto2 " + " Esta Balanceado?: " + balancerFile2);
    }

    public static boolean checkParenthesis(String stringToValidate) {
        StackADT<Character> balanceador=new StackADT();

        for (int i = 0; i < stringToValidate.length(); i++) {
            char currentChar = stringToValidate.charAt(i);
            switch (currentChar) {
                case '(':
                case '[':
                case '{':
                    balanceador.push(currentChar);
                    break;

                case ')':
                case ']':
                case '}':
                    if (balanceador.isEmpty())
                        return false;
                    else {
                        char charInStack =balanceador.pop();
                        if (currentChar == ')' && charInStack != '(')
                            return false;
                        else if (currentChar == ']' && charInStack != '[')
                            return false;
                        else if (currentChar == '}' && charInStack != '{')
                            return false;
                    }
                    break;

                default:
                    break;
            }
        }

        return balanceador.isEmpty();
    }

    public static String readFileContent(String fileName) {
        String line, fileContent = "";
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                fileContent += line;
            }
            bufferedReader.close();
        } catch (Exception e) {
            System.out.println("Error al leer el archivo");
        }
        return fileContent;
    }
}