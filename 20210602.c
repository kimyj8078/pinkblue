/* ������ ������ ����ϴ� ���α׷� */
#include <stdio.h> 
int main(){
	int i=127;
	int j;
	
	printf("%d, %x \n", i, i);			//���� i�� ���� 10������ 16������ ���
	printf("%x \n", &i);				//&������: �ּҿ�����
	printf("%#x \n", &i);
	printf("%x \n", &j);
	printf("%#x \n", &j); 
}
