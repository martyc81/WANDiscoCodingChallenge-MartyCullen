public class CodingChallenge {

    public static void main(String[] args) {

        volumeOfSphere(1);
        volumeOfSphere(5);
        volumeOfCube(1);
        volumeOfCube(5);
        volumeOfTetrahedron(1);
        volumeOfTetrahedron(5);
    }

    public static double volumeOfSphere(int radius){
        double sphereVolume = (4 * Math.PI * Math.pow(radius, 3))/3;
        System.out.printf("The volume of your sphere is %.2f %n", sphereVolume);
        return sphereVolume;
    }

    public static double volumeOfCube(int cubeSide){
        double cubeVolume = Math.pow(cubeSide, 3);
        System.out.printf("The volume of your cube is %.2f %n", cubeVolume);
        return cubeVolume;
    }

    public static double volumeOfTetrahedron(int tetrahedronSide){
        double tetrahedronVolume = Math.pow(tetrahedronSide, 3)/(6*(Math.sqrt(2)));
        System.out.printf("The volume of your tetrahedron is %.2f %n", tetrahedronVolume);
        return tetrahedronVolume;
    }
}
