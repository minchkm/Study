
Table ACCOUNTS��(��) �����Ǿ����ϴ�.

Ŀ�� �Ϸ�.

����� 2 �࿡�� �����ϴ� �� ���� �߻� -
create table accounts(
ano varchar2(50)primary key, --���¹�ȣ
owner varchar2(50) not null, --���� ������
balance number(38) not null --���� �ܾ�
)
���� ���� -
ORA-00955: name is already used by an existing object
00955. 00000 -  "name is already used by an existing object"
*Cause:    
*Action:
���õ� �� ����

����� 10 �࿡�� �����ϴ� �� ���� �߻� -
insert into accounts valuse('123-111-1111','ȫ�浿',100000)
���� �߻� �����: 10 ��: 29
���� ���� -
SQL ����: ORA-00928: missing SELECT keyword
00928. 00000 -  "missing SELECT keyword"
*Cause:    
*Action:

����� 11 �࿡�� �����ϴ� �� ���� �߻� -
insert into acoounts valuse('222-222-222',:'�浿',100000)
���� �߻� �����: 11 ��: 29
���� ���� -
SQL ����: ORA-00928: missing SELECT keyword
00928. 00000 -  "missing SELECT keyword"
*Cause:    
*Action:
Ŀ�� �Ϸ�.

����� 2 �࿡�� �����ϴ� �� ���� �߻� -
create table accounts(
ano varchar2(50)primary key, --���¹�ȣ
owner varchar2(50) not null, --���� ������
balance number(38) not null --���� �ܾ�
)
���� ���� -
ORA-00955: name is already used by an existing object
00955. 00000 -  "name is already used by an existing object"
*Cause:    
*Action:
���õ� �� ����

����� 10 �࿡�� �����ϴ� �� ���� �߻� -
insert into accounts valuse('123-111-1111','ȫ�浿',100000)
���� �߻� �����: 10 ��: 29
���� ���� -
SQL ����: ORA-00928: missing SELECT keyword
00928. 00000 -  "missing SELECT keyword"
*Cause:    
*Action:

����� 11 �࿡�� �����ϴ� �� ���� �߻� -
insert into acoounts valuse('222-222-222',:'�浿',100000)
���� �߻� �����: 11 ��: 29
���� ���� -
SQL ����: ORA-00928: missing SELECT keyword
00928. 00000 -  "missing SELECT keyword"
*Cause:    
*Action:
Ŀ�� �Ϸ�.
