package chongxie;
/**
 * 家庭类——子类
 * 方法名相同
 * 参数列表相同
 * 返回类型相同或者是其父类的子类
 * 修饰符不得严于父类
 * @author Administrator
 *
 */
public class Family_zi extends Family_fu {
	public String show(){	//对父类show()方法进行重写
		String str="我的家庭有："+super.getFather()+"、"+super.getMother()+"、"
				+super.getGrandfa()+"、"+super.getGrandma()+"、"+super.getBorther()
				+"、"+super.getSister();
		return str;
	}
}
