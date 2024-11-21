public class Study01 {
    
    /* 생성자 */
    public Study01() {
    }
    public Study01(int a){

    }
    
    /* static -> 즉시 메모리 할당 */
    public static void main(String[] args) {
        Study01 study = new Study01();
        System.out.println(study);
        int a= study.RespondNum();
        System.out.println(a);
    }

    
    
     public int RespondNum(){
        return 1;
    }
}