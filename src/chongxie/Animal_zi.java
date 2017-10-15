package chongxie;
/**
 * 动物类——子类
 * 方法名相同
 * 参数列表相同
 * 返回类型相同或者是其父类的子类
 * 修饰符不得严于父类
 * @author Administrator
 *
 */
public class Animal_zi extends Animal_fu{
	private String train="dog";		//动物的品种
	public String show(){			//对父类show()方法的重写，与父类方法体不同
		String str="我叫："+super.getName()+"\t我身上的颜色是："+super.getColor()+"\t我的年龄："+super.getAge()+"岁";
		str=str+"我是一只"+train;
		return str;
	}
}
