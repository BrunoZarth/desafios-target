public class InverteCaracteres {
    public static String InverterString(String string){
        String stringInvertida = "";
        int tamanhoString = string.length();
        for(int i = tamanhoString; i>0; i--){
            //stringInvertida.concat(String.valueOf(string.charAt(i - 1)));
            stringInvertida += string.charAt(i - 1);
        }
        System.out.println(string + " / " + stringInvertida);
        return stringInvertida;
    }
}
