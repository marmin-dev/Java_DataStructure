package stackEx;

public class ArrayStack {
	private Object[] stack;
	private int top;
	
	public ArrayStack(int length) {
		//빈 스택은 top =-1로 표현
		this.top = -1;
		this.stack = new Object[length];
	}
	//데이터 삽입 메서드
	public void push(Object data) {
		//top이 스택의 최대 인덱스를 가리키고 있다면 에러 발생
		if(top == stack.length-1) {
			throw new StackOverflowError();
		}
		stack[++top] = data;
	}
	//데이터 가져오기
	public Object pop() {
		//빈 스택에서 데이터 가져오기 예외처리
		if(top == -1) {
			throw new ArrayIndexOutOfBoundsException();
		}
		Object temp = stack[top];
		stack[top--] = null;
		return temp;
	}
	//현재 스택의 마지막 데이터 가져오기(지우기x)
	public Object peek() {
		return stack[top];
	}
	//비어있는가?
	public boolean empty() {
		return top == -1;
	}
	
	public boolean contains(Object value) {
		for(int i =0;i<stack.length;i++) {
			if(stack[i]==value) {
				return true;
			}
		}
		return false;
	}
	public int size() {
		int cnt = 0;
		for(int i=0;i<stack.length;i++) {
			if(stack[i]==null) {
				break;
			}
			cnt++;
		}
		return cnt;
	}
	
	
}
