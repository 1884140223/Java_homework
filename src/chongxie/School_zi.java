package chongxie;
/**
 * 学校类——子类
 * 方法名相同
 * 参数列表相同
 * 返回类型相同或者是其父类的子类
 * 修饰符不得严于父类
 * @author Administrator
 *
 */
public class School_zi extends School_fu{
	public School_zi(){		//子类的构造方法
		super();
		super.setName("李民");
		super.setNumber("632549");
		super.setSex("男");
		super.setAge(35);
		super.setJob("教务处主任");
	}
	public String show(){		//重写父类show()方法
		String str="员工姓名："+super.getName()+"\n员工编号："+super.getNumber()+"\n员工性别："+super.getSex()+"\n员工年龄："+super.getAge()+"\n员工职位："+super.getJob();
		return str;
	}
}
