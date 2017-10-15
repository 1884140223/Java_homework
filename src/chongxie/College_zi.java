package chongxie;
/**
 * 大学类——子类
 * 方法名相同
 * 参数列表相同
 * 返回类型相同或者是其父类的子类
 * 修饰符不得严于父类
 * @author Administrator
 *
 */
public class College_zi extends College_fu {
	/*对父类show()方法进行重写*/
	public String show(String name,String number,String city,String type){
		super.setName(name);
		super.setNumber(number);
		super.setCity(city);
		super.setType(type);
		String str="大学名称："+super.getName()+"\n大学编号："+super.getNumber()+"\n大学所在城市："+super.getCity()+"\n大学类型："+super.getType();
		return str;
	}
}
