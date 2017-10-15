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
public abstract class Pet_fu {
	private String name="旺财";			//名字
	private String train="雪纳瑞";		//品种
	private String color="白色";			//毛发颜色
	public abstract String show();		//抽象方法：返回狗狗信息
	
	
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
	public String getTrain() {
		return train;
	}
	public void setTrain(String train) {
		this.train = train;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
}
