-- ���� ������ ����� accounts ���̺� ����
create table accounts(
  ano varchar2(50) primary key,    -- ���¹�ȣ
  owner varchar2(50) not null,     -- ���� ������
  balance number(38) not null      -- ���� �ܾ�
);

-- ������ �Է�
insert into accounts values('123-111-1111', 'ȫ�浿', 100000);
insert into accounts values('222-222-2222', '�浿', 100000);

-- ������ ��ȸ
select * from accounts order by balance asc;

-- ������� ����
commit;
