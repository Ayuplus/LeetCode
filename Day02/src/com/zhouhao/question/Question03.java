package com.zhouhao.question;

/**
 *请你给一个停车场设计一个停车系统。停车场总共有三种不同大小的车位：大，中和小，每种尺寸分别有固定数目的车位。
 *
 * 请你实现ParkingSystem类：
 *
 * ParkingSystem(int big, int medium, int small初始化ParkingSystem类，三个参数分别对应每种停车位的数目。
 * bool addCar(int carType)检查是否有carType对应的停车位。carType有三种类型：大，中，小，分别用数字1，2和3表示。一辆车只能停在carType对应尺寸的停车位中。
 * 如果没有空车位，请返回false，否则将该车停入车位并返回true。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/design-parking-system
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Question03 {
    public static void main(String[] args) {
        ParkingSystem parkingSystem = new ParkingSystem(1, 1, 0);
        System.out.println(parkingSystem.addCar(1));
        System.out.println(parkingSystem.addCar(2));
        System.out.println(parkingSystem.addCar(3));
        System.out.println(parkingSystem.addCar(1));
    }
}
