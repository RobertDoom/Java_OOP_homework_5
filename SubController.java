package Java_OOP_homework_5;

public class SubController {
    View view;
    SubModel subModel;

    public SubController(View view, SubModel subModel) {
        this.view = view;
        this.subModel = subModel;
    }
    public void doSub(){
        int a = view.getValue();
        int b = view.getValue();
        subModel.setX(a);
        subModel.setY(b);
        int result = subModel.result();
        view.print(result, "Разность: ");
    }
}
