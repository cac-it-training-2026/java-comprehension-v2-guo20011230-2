package q01_basic.question01;

/**
 * Member 会員クラス
 */
class Member {
	//TODO ここから実装する
	String name;
	int age;
	int rank;

	public void showMember() {
		System.out.println("***MEMBER DATA***");
		System.out.println("メンバー名：" + name);
		System.out.println("年齢：" + age);
		System.out.println("ランク：" + rank);
		System.out.println("*****************");

	}
}