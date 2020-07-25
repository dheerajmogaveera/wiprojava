create or replace procedure calculateSalary(eno in number,netsal out number)
is
empcomm number;
empsal number;
gs number;
nsal number;
it number;
begin
select comm into empcomm from emp where empno=eno;
select sal into empsal from emp where empno=eno;
if empcomm is null then
empcomm :=0;
end if;
gs :=empsal+empcomm;
if empcomm=0 then
it :=gs*10/100;
else
if empcomm<500 then
it :=gs*15/100;
else
it :=gs*20/100;
end if;
end if;
nsal :=gs-it;
netsal :=nsal;
end calculateSalary;
/
