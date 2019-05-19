


import java.util.Arrays;

public class AlexJQQExC1 {
    
    public static void ExC1AlexJQQ() {
        int[] array = {10,8,25,9,5,72,17,60,55,44};
        System.out.println(Arrays.toString(array));
        System.out.println(AlexJQQbusca(array,8));
        System.out.println(AlexJQQbusca(array,17));
        System.out.println(AlexJQQbusca(array,5));
	}

    private static int AlexJQQbusca(int[] array, int chave) {
        return AlexJQQbuscaBinariaRecur(array, 0, array.length - 1, chave);
    }

    private static int AlexJQQbuscaBinariaRecur(int[] array, int menor, int maior,
        int chave) {
            int media = (maior + menor) / 2;
            int valorMeio = array[media];
            if (menor > maior)
                return -1;
            else if(valorMeio == chave) 
                return media;
            else if (valorMeio < chave)
                return AlexJQQbuscaBinariaRecur(array, media+1, maior, chave);
            else
                return AlexJQQbuscaBinariaRecur(array, menor, media-1, chave);
	}
    
    public static void main(String[] args) {
        ExC1AlexJQQ();
    }
    }