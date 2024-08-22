package sec01.exam02;

public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			if(id.equals(member.id)) { // 문자열이 동일한지 조사하기 위해
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return id.hashCode();
	}

}
