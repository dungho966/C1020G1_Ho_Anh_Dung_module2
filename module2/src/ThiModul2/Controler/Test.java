package ThiModul2.Controler;

import ThiModul2.Model.RealPhone;

import javax.xml.bind.SchemaOutputResolver;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        TreeSet<RealPhone> treeSet = new TreeSet();
        RealPhone realPhone1 = new RealPhone(5);
        RealPhone realPhone2 = new RealPhone(4);
        RealPhone realPhone3 = new RealPhone(6);
        treeSet.add(realPhone1);
        treeSet.add(realPhone3);
        treeSet.add(realPhone2);
    }
}
