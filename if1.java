public class if1 {
    public static void main(String[] args) {
        int x = 10
                if(x=4){ //если х=4 выполняем код
                    System.out.println("x равен 4" );
                } else if (x=8) {//если х=8 выполняем код
                    System.out.println("x равен 8" );
                } else if (x=10) {//если х=8 выполняем код
                    System.out.println();ystem.out.println("x равен 10" );
                }else{ //вполняет в случае того,если условия выше не найдены
                    System.out.println("диапазон не найден");
                }
        if(x>=0 && x=<10){ //если х попадает в диапазон от 0 до 10
            System.out.println("x в диапазоне от 0 до 10");
        }else if (x >= 11 && x<=20) {//если х попадает в диапазон от 11 до 20
            System.out.println("x в диапазоне от 11 до 20");
        }else{ //если х не нашелся выше
            System.out.println("x не попал в диапазон");
        }
        if(x>0 && y>0){
            System.out.println("x и y положительное число");
        }
    }
}
