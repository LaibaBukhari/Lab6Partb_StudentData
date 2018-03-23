-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 23, 2018 at 12:08 PM
-- Server version: 10.1.28-MariaDB
-- PHP Version: 7.1.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `university`
--

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `ID` int(6) NOT NULL,
  `RegNo` int(6) NOT NULL,
  `Name` varchar(30) NOT NULL,
  `Class` varchar(30) NOT NULL,
  `Section` varchar(2) NOT NULL,
  `Contact` varchar(30) NOT NULL,
  `Address` varchar(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`ID`, `RegNo`, `Name`, `Class`, `Section`, `Contact`, `Address`) VALUES
(1, 124757, 'Laiba', 'BESE6', 'B', '03329958520', 'G-8/4 Islamabad'),
(2, 200002, 'Hammad', 'BESE6', 'B', '090078601', 'NUST Hostels'),
(3, 300003, 'Tehreem', 'BESE6', 'B', '03331234567', 'G-9/4 Islamabad'),
(4, 400004, 'Ayesha', 'BESE6', 'B', '03330987654', 'NUST Hostels'),
(5, 500005, 'Rafay', 'BESE6', 'A', '03320192837', 'Rawalpindi'),
(6, 600006, 'Ayman', 'BESE6', 'A', '03231234567', 'Peshawar');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `student`
--
ALTER TABLE `student`
  MODIFY `ID` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
