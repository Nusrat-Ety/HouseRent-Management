-- phpMyAdmin SQL Dump
-- version 3.2.4
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Nov 27, 2019 at 08:51 AM
-- Server version: 5.1.41
-- PHP Version: 5.3.1

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `db_rent`
--

-- --------------------------------------------------------

--
-- Table structure for table `tb_landlord`
--

CREATE TABLE IF NOT EXISTS `tb_landlord` (
  `Floor` varchar(50) NOT NULL,
  `Unit` varchar(30) NOT NULL,
  `Month` varchar(20) NOT NULL,
  `Details` varchar(40) NOT NULL,
  `Rent` int(50) NOT NULL,
  `Due` int(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_landlord`
--

INSERT INTO `tb_landlord` (`Floor`, `Unit`, `Month`, `Details`, `Rent`, `Due`) VALUES
('1st floor', '1A', 'January', 'Md.Monir Hossain.Phn-0173333330', 25000, 0),
('1st floor', '1B', 'February', 'Mst-Jhorna.Phn-01683258765', 20000, 5000),
('2nd floor', '2A', 'January', 'Md-Nahid Hasan.Phn-0158767588', 30000, 0),
('2nd floor', '2B', 'February', 'Md-Karim.Phn-019435675', 30000, 0);

-- --------------------------------------------------------

--
-- Table structure for table `tb_tenant`
--

CREATE TABLE IF NOT EXISTS `tb_tenant` (
  `Floor` varchar(50) NOT NULL,
  `Unit` varchar(30) NOT NULL,
  `Month` varchar(20) NOT NULL,
  `Details` varchar(40) NOT NULL,
  `Rent` int(50) NOT NULL,
  `Due` int(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_tenant`
--

INSERT INTO `tb_tenant` (`Floor`, `Unit`, `Month`, `Details`, `Rent`, `Due`) VALUES
('1st floor', '1A', 'January', 'Md.Monir Hossain.Phn-0173333330', 25000, 0),
('1st floor', '1B', 'February', 'Mst-Jhorna.Phn-01683258765', 20000, 5000),
('2nd floor', '2A', 'January', 'Md-Nahid Hasan.Phn-0158767588', 30000, 0),
('2nd floor', '2B', 'February', 'Md-Karim.Phn-019435675', 30000, 0);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
