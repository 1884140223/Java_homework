package abstracts;
/**
 * 宠物类
 * 抽象类不能被实例化
 * 继承抽象类：若抽象类中有抽象方法，必须对抽象方法进行重写，实现方法的功能
 * 方法名相同
 * 参数列表项相同
 * 返回类型相同或是其父类的子类
 * 修饰符不得严于父类
 * @author Administrator
 *
 */
public class Pet_zi extends Pet_fu {

	@Override
	public String show() {		//对父类抽象方法重写
		// TODO Auto-generated method stub
		String str="我的名字叫："+super.getName()+"\n我身上的颜色是："+super.getColor()+"\n我是一只"+super.getTrain();
		return str;
	}

}
