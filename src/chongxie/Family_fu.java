package chongxie;
/**
 * 家庭类——父类
 * 方法名相同
 * 参数列表相同
 * 返回类型相同或者是其父类的子类
 * 修饰符不得严于父类
 * @author Administrator
 *
 */
public class Family_fu {
	private String father="爸爸";			//家庭成员——父亲
	private String mother="妈妈";			//家庭成员——母亲
	private String grandfa="爷爷";		//家庭成员——祖父
	private String grandma="奶奶";		//家庭成员——祖母
	private String borther="兄弟";		//家庭成员——兄弟
	private String sister="姐妹";			//家庭成员——姐妹
	public String show(){			//show()方法：返回我的家庭基本信息
		String str="我的家庭有："+father+"、"+mother+"、"+grandfa+"、"+grandma;
		return str;
	}
	
	/**
	 * 对类的封装
	 * private除了本类，其他类无法使用
	 * 使用get、set方法访问privat成员
	 * @return
	 */
	public String getFather() {
		return father;
	}
	public void setFather(String father) {
		this.father = father;
	}
	public String getMother() {
		return mother;
	}
	public void setMother(String mother) {
		this.mother = mother;
	}
	public String getGrandfa() {
		return grandfa;
	}
	public void setGrandfa(String grandfa) {
		this.grandfa = grandfa;
	}
	public String getGrandma() {
		return grandma;
	}
	public void setGrandma(String grandma) {
		this.grandma = grandma;
	}
	public String getBorther() {
		return borther;
	}
	public void setBorther(String borther) {
		this.borther = borther;
	}
	public String getSister() {
		return sister;
	}
	public void setSister(String sister) {
		this.sister = sister;
	}
	
}
