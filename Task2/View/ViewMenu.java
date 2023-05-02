package Task2.View;

import java.util.Scanner;

import Task2.Presenter.Presenter;

public class ViewMenu {
    private Presenter mPresenter;

    public void ViewMenuUser(Scanner input) {
        mPresenter = new Presenter(this);
        System.out.println("==========Выберете операцию=============");
        System.out.println("1. Показать список призов");
        System.out.println("2. Сыграть и забрать приз");
        System.out.println("3. Выход");
        int key = input.nextInt();
        mPresenter.operationNum(key, input);

    }

}
