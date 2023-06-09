//package com.masai.runner;
//
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;
//import java.util.InputMismatchException;
//import java.util.Map;
//import java.util.Scanner;
//
//import com.masai.entities.Admin;
//
////import com.masai.entities.Admin;
//import com.masai.entities.Crime;
//import com.masai.entities.Criminal;
//import com.masai.exceptions.AdminAlreadyExistsException;
//import com.masai.exceptions.CrimeNotFoundException;
//import com.masai.exceptions.CriminalNotFoundException;
//import com.masai.utility.FileExists;
//
//public class Main {
//    private static Scanner scanner = new Scanner(System.in);
////    private static Map<Integer, Admin> adminMap;
//
//    private static Map<Integer, Criminal> criminalMap;
//    private static Map<Integer, Crime> crimeMap;
////    private static Admin loggedInAdmin;
//
//    public static void main(String[] args) throws AdminAlreadyExistsException {
//        // Load data from files
////        adminMap = FileExists.getAdminData();
//        criminalMap = FileExists.getCriminalData();
//        crimeMap = FileExists.getCrimeData();
//
//        int option = 0;
//
//        while (option != 3) {
//            System.out.println("Welcome to the Crime Management System\n");
//            System.out.println("1. Sign In");
//            System.out.println("2. Sign Up");
//            System.out.println("3. Exit");
//
//            try {
//                option = scanner.nextInt();
//                scanner.nextLine();
//
//                switch (option) {
//                    case 1:
//                        signIn();
//                        break;
//                    case 2:
//                        signUp();
//                        break;
//                    case 3:
//                        System.out.println("Thank you for using the Crime Management System.");
//                        break;
//                    default:
//                        System.out.println("Invalid option. Please try again.");
//                        break;
//                }
//            } catch (InputMismatchException e) {
//                System.out.println("Invalid input. Please try again.");
//                scanner.nextLine();
//            }
//        }
//
//        // Save data to files
////        FileExists.saveDataToFile(FileExists.ADMIN_FILE_PATH, adminMap);
//        FileExists.saveDataToFile(FileExists.CRIMINAL_FILE_PATH, criminalMap);
//        FileExists.saveDataToFile(FileExists.CRIME_FILE_PATH, crimeMap);
//    }
//
//    private static void signIn() {
//        System.out.println("Enter your email address:");
//        String email = scanner.nextLine();
//
//        System.out.println("Enter your password:");
//        String password = scanner.nextLine();
//
//        if (adminMap.containsKey(email.hashCode())) {
//            Admin admin = adminMap.get(email.hashCode());
//
//            if (admin.getPassword().equals(password)) {
//                System.out.println("Successfully signed in as " + admin.getUsername());
//                loggedInAdmin = admin;
//            } else {
//                System.out.println("Incorrect password. Please try again.");
//            }
//        } else {
//            System.out.println("Admin account not found. Please try again.");
//        }
//    }
//
//    private static void signUp() throws AdminAlreadyExistsException {
//        System.out.println("Enter your name:");
//        String name = scanner.nextLine();
//
//        System.out.println("Enter your email address:");
//        String email = scanner.nextLine();
//
//        System.out.println("Enter your password:");
//        String password = scanner.nextLine();
//
//        if (adminMap.containsKey(email.hashCode())) {
//            throw new AdminAlreadyExistsException("An admin account with this email already exists.");
//        } else {
//            Admin admin = new Admin(name, email, password);
//            adminMap.put(email.hashCode(), admin);
//            System.out.println("Successfully signed up as " + admin.getUsername());
//            loggedInAdmin = admin;
//        }
//        
//        // Save the updated admin map to file
//        FileExists.saveDataToFile(FileExists.ADMIN_FILE_PATH, adminMap);
//    }
//
//}