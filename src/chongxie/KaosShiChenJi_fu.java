package chongxie;
/**
 * 考试类——父类
 * 方法名相同
 * 参数列表相同
 * 返回类型相同或者是其父类的子类
 * 修饰符不得严于父类
 * @author Administrator
 *
 */
public class KaosShiChenJi_fu {
	private String cource="数学";		//考试科目
	private int number=92;			//考试成绩
	public String show(){			//show()方法返回考试科目和成绩
		String str=cource+":"+number;
		return str;
	}
	
	/**
	 * 对类的封装
	 * private除了本类，其他类无法使用
	 * 使用get、set方法访问privat成员
	 * @return
	 */
	public String getCource() {
		return cource;
	}
	public void setCource(String cource) {
		this.cource = cource;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
}
