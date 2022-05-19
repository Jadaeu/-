package demo7;
import java.util.*;
public class DivGroup {
    public static void main(String[] args) {
        no1();
    }
    public static void no1(){
        Random random = new Random();
        List list = new ArrayList();

        // 把每一个国家的长度都保持一致,避免打印的时候出现错位的情况
        list.add("科特迪瓦");list.add("阿根廷  ");list.add("澳大利亚");list.add("塞尔维亚");list.add("荷兰    ");list.add("尼日利亚");list.add("日本    ");list.add("美国    ");
        list.add("中国    ");list.add("新西兰  ");list.add("巴西    ");list.add("比利时  ");list.add("韩国    ");list.add("喀麦隆  ");list.add("洪都拉斯");list.add("意大利  ");

        List arr = new ArrayList(); // 设置一个新数组,接收随机数
        for (int i = 0; i < 16; i++) {
            boolean flag = true;
            while(flag) {   // 循环,如果随机数已经存在了就继续随机
                int a = random.nextInt(16);
                if (arr.indexOf(a) == -1){ // 判断随机数a是否存在于arr集合中,存在返回索引,不存在返回-1
                    arr.add(a);
                    flag = false;
                }
            }
        }
        System.out.println("第一组\t\t第二组\t\t第三组\t\t第四组");
        for (int i = 1; i <= arr.size(); i++) { // 设置循环十六次,因为每四次换行,i%4==0  当i=0时直接换行,所以i从1开始
            int a = (int) arr.get(i-1); // 取出随机出来的数 i从1开始,所以要减一
            System.out.print(list.get(a) + "\t");
            if (i % 4 == 0 ){   // 每四个国家循环完就换行
                System.out.println();
            }
        }

    }


}
