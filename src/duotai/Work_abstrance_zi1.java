package duotai;
/**
 * 同一个引用类型，使用不同的实例而执行不同的操作
 * 具有继承关系的父类和子类
 * 子类重写父类的方法
 * 使用父类的引用类型指向子类的对象
 * @author Administrator
 * 
 */
public class Work_abstrance_zi1 extends Work_abstrance {
	public Work_abstrance_zi1(){	//重写父类方法
		super.setName("Java高级工程师");
		super.setMoney("月薪10k~10.5k");
		super.setCity("合肥");
	}
	@Override
	public String show() {
		// TODO Auto-generated method stub
		String str="工作："+super.getName()+"\t"+super.getMoney()+"\t所在地："+super.getCity();
		return str;
	}

}
