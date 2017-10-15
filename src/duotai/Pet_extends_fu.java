 package duotai;
 /**
  * 同一个引用类型，使用不同的实例而执行不同的操作
  * 具有继承关系的父类和子类
  * 子类重写父类的方法
  * 使用父类的引用类型指向子类的对象
  * @author Administrator
  * 
  */
public class Pet_extends_fu {
	private String name;
	private String sex;
	private String color;
	public String show(){
		return null;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
