public class poyasnenie {
    int nummers = {10,12,34,59}; //числа в массиве
    int middle = 0;//переменная для хранения числа
        for(int avg_i = 0;avg_i < nummers.length /* чтоб цикл не вышел за рамки массива */;avg_i++) {
        middle += nummers[avg_i];// так как avg_i =0 то к  middle += присваиваеться 1е число nummers[0"10"]
    }//1 цикл закончился middle = 10
}
//for(int avg_i = 1 - стал 1 потому что цикл прибавил к ней 1;avg_i < nummers.length ;avg_i++) {
//получаеться midle(10)+=nummers[1](12) middle=10+12
//for(int avg_i = 2 - стал 2 потому что цикл прибавил к ней 1;avg_i < nummers.length ;avg_i++)
//получаеться midle(22)+=nummers[2](34) middle=22+34
//и т.д. пока avg_i не станет размером с длинной цикла
//