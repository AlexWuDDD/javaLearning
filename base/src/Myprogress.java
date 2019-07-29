import java.util.Date;

public class Myprogress
{
    public static void main(String[] args)
    {
        System.out.println("Mon Jul 08 05:40:02 CST 2019" + " 看到 3.9， 还没开始");
        System.out.println("Tue Jul 09 11:30:38 CST 2019" + " 看到 第4章， 还没开始");
        System.out.println("Tue Jul 09 15:58:01 CST 2019" + " 看到 4.4， 还没开始");
        System.out.println("Wed Jul 10 06:52:20 CST 2019" + " 看到 4.6， 还没开始");
        System.out.println("Wed Jul 10 09:19:52 CST 2019" + " 看到 第5章， 还没开始");
        System.out.println("Thu Jul 11 08:56:15 CST 2019" + " 看到 5.2.2， 还没开始");
        System.out.println("Mon Jul 15 06:09:27 CST 2019" + " 看到 5.4， 还没开始");
        System.out.println("Thu Jul 18 06:40:31 CST 2019" + " 看到 5.7， 还没开始");
        System.out.println("Mon Jul 22 09:02:02 CST 2019" + " 看到 5.7.5， 还没开始");
        System.out.println("Mon Jul 29 08:17:39 CST 2019" + " 看到 6.1.2， 还没开始");
        System.out.println(new Date() + " 看到 XXX， 还没开始");

    }


//    下面给出编写一个完美的 equals 方法的建议:
//        1 ) 显式参数命名为 otherObject, 稍后需要将它转换成另一个叫做 other 的变量。
//        2 ) 检测 this 与 otherObject 是否引用同一个对象:
//              if (this = otherObject) return true;
//            这条语句只是一个优化。 实际上， 这是一种经常采用的形式。
//            因为计算这个等式要比一 个一个地比较类中的域所付出的代价小得多。
//        3 ) 检测 otherObject 是否为 null , 如 果 为 null , 返 回 false。
//        这项检测是很必要的。 if (otherObject = null) return false;
//        4 ) 比较 this 与 otherObject 是否属于同一个类。
//              如果 equals 的语义在每个子类中有所改 变， 就使用 getClass 检测:
//              if (getClass() != otherObject.getCIassO) return false;
//              如果所有的子类都拥有统一的语义，
//              就使用 instanceof 检测:
//              if (!(otherObject instanceof ClassName))
//              return false;
//        5 ) 将 otherObject 转换为相应的类类型变量:
//        ClassName other = (ClassName) otherObject
//        6 )现在开始对所有需要比较的域进行比较了。
//          使用= 比较基本类型域，使用equals比 较对象域。
//          如果所有的域都匹配，就返回true; 否则返回false。
//          return fieldl == other.field
//          && Objects.equa1s(fie1d2, other.field2)
//          如果在子类中重新定义equals, 就要在其中包含调用super.equals(other)
}
