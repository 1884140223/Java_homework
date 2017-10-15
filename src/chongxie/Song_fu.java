package chongxie;
/**
 * 歌曲类——父类
 * 方法名相同
 * 参数列表相同
 * 返回类型相同或者是其父类的子类
 * 修饰符不得严于父类
 * @author Administrator
 *
 */
public class Song_fu {
	private String name;			//歌曲名字
	private String singer;			//歌手(演唱者)
	public String show(String name,String singer){		//给成员变量赋值
		this.name=name;
		this.singer=singer;
		return null;
	}
	
	
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
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	
	
}
