package abstracts;
/**
 * 个人信息类
 * 抽象类不能被实例化
 * 继承抽象类：若抽象类中有抽象方法，必须对抽象方法进行重写，实现方法的功能
 * 方法名相同
 * 参数列表项相同
 * 返回类型相同或是其父类的子类
 * 修饰符不得严于父类
 * @author Administrator
 *
 */
public class Person_zi extends Person_fu {
	public Person_zi(){		//子类构造方法
		super();
		super.setName("张三");
		super.setSex("男");
		super.setHeight("180cm");
		super.setWight("80kg");
	}
	@Override
	public String show() {		//对父类抽象方法的重写
		// TODO Auto-generated method stub
		String str="我叫："+super.getName()+"\n性别："+super.getSex()+"\n身高："+super.getHeight()+"\n体重："+super.getWight();
		return str;
	}
	
}
