import Calculation.RobotOrder;
import com.state.Manufacturer;
import com.state.Robot;
import com.state.RobotType;
import com.state.Toy;

import javax.security.auth.Subject;
import java.util.*;

public class Runner {

    public static void main(String[] args) {
//����� ������ sound
        Robot man = new Robot();
        man.setType(RobotType.HUMAN);
        man.sound();


// ������ �� ������� ������� ArrayList
        ArrayList<Robot> robotArrayList = new ArrayList<>();
        robotArrayList.add(new Robot(5500, "Optimus Prime","red", RobotType.TRANSFORMER, true, 200));
        robotArrayList.add(new Robot(5000, "Bumblebee","yellow", RobotType.TRANSFORMER, true, 150));
        robotArrayList.add(new Robot(6000, "Megatron","blue", RobotType.TRANSFORMER, true, 210));
        robotArrayList.add(new Robot(6000, "Megatron","blue", RobotType.TRANSFORMER, true, 210));
        System.out.println(robotArrayList);

// ������ �� ������� ������� Set
        Set<Robot> robotSet = new HashSet<>();
        robotSet.add(new Robot(5500, "Optimus Prime","red", RobotType.TRANSFORMER, true, 200));
        robotSet.add(new Robot(5000, "Bumblebee","yellow", RobotType.TRANSFORMER, true, 150));
        robotSet.add(new Robot(6000, "Megatron","blue", RobotType.TRANSFORMER, true, 210));
        robotSet.add(new Robot(6000, "Megatron","blue", RobotType.TRANSFORMER, true, 210));
        System.out.println(robotSet);

//������ ��
        Map<Robot, Manufacturer> robotManufacturerMap = new HashMap<>();
        Robot robot1 = new Robot();
        robot1.setType(RobotType.HUMAN);
        Robot robot2 = new Robot();
        robot2.setType(RobotType.ANIMAL);

        robotManufacturerMap.put(robot1, new Manufacturer("Silverlit", "The USA"));
        robotManufacturerMap.put(robot2, new Manufacturer("XayWay", "China"));
        System.out.println(robotManufacturerMap);
    }
}

// ����������� ������������
//2) �������� ���� ������� List (� �������)+, Set (������� ���������� ������� - ����� �� ������ �������)+, Map ().
//3) ���������� ����������� ����� Collections. �������� � ���� ������ ������, ����������� ������������� ������� � ����������.
//4) ����������� ��������, ��������� (��������� �����������) ������ � ������� ��� � ��������.

