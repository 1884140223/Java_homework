package abstracts;
/**
 * 个人信息类类
 * 抽象类不能被实例化
 * 继承抽象类：若抽象类中有抽象方法，必须对抽象方法进行重写，实现方法的功能
 * 方法名相同
 * 参数列表项相同
 * 返回类型相同或是其父类的子类
 * 修饰符不得严于父类
 * @author Administrator
 *
 */
public abstract class Person_fu {
	private String name;		//个人姓名
	private String sex;			//性别
	private String height;		//身高
	private String wight;		//体重
	public abstract String show();//抽象方法：放回个人信息功能
	
	
	/**
	 * 对类的封装
	 * private除了本类，其他类无法使用
	 * 使用get、set方法访问privat成员
	 * @return
	 */
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
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getWight() {
		return wight;
	}
	public void setWight(String wight) {
		this.wight = wight;
	}
	
	
}
