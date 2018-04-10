-- phpMyAdmin SQL Dump
-- version 4.4.15.5
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1:3306
-- Generation Time: Nov 24, 2017 at 11:37 AM
-- Server version: 5.6.34-log
-- PHP Version: 7.0.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `clbmgmt`
--
CREATE DATABASE IF NOT EXISTS `clbmgmt` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `clbmgmt`;

DELIMITER $$
--
-- Procedures
--
DROP PROCEDURE IF EXISTS `clubmemberinfocheck`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `clubmemberinfocheck`(IN `uninum` VARCHAR(20), IN `clubnum` INT(2), IN `newun` VARCHAR(20), IN `newna` VARCHAR(100), IN `newpa` VARCHAR(10))
    NO SQL
BEGIN
UPDATE `member` SET USN=newun,Name=newna,passw=newpa WHERE USN=uninum AND CID=clubnum;
END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `clubs`
--

DROP TABLE IF EXISTS `clubs`;
CREATE TABLE IF NOT EXISTS `clubs` (
  `clbname` varchar(20) NOT NULL,
  `cid` int(2) NOT NULL,
  `mid` int(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `clubs`
--

INSERT INTO `clubs` (`clbname`, `cid`, `mid`) VALUES
('ai', 10, 1000),
('Aerospace club', 11, 1001),
('robotics club', 12, 1002),
('Electronics club', 13, 1003);

-- --------------------------------------------------------

--
-- Table structure for table `manager`
--

DROP TABLE IF EXISTS `manager`;
CREATE TABLE IF NOT EXISTS `manager` (
  `MID` int(4) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `CLUBID` int(2) NOT NULL,
  `Pass` char(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `manager`
--

INSERT INTO `manager` (`MID`, `Name`, `CLUBID`, `Pass`) VALUES
(1000, 'Mark', 10, 'brute'),
(1001, 'Shady', 11, 'break'),
(1002, 'Steve', 12, 'fruit'),
(1003, 'Tesla', 13, 'steal');

-- --------------------------------------------------------

--
-- Table structure for table `member`
--

DROP TABLE IF EXISTS `member`;
CREATE TABLE IF NOT EXISTS `member` (
  `USN` varchar(10) NOT NULL DEFAULT '',
  `Name` varchar(100) NOT NULL,
  `CID` int(2) NOT NULL,
  `ProjectID` int(4) NOT NULL DEFAULT '0',
  `passw` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `member`
--

INSERT INTO `member` (`USN`, `Name`, `CID`, `ProjectID`, `passw`) VALUES
('111333ooel', 'nescafe', 13, 0, 'drug'),
('11eewwuute', 'switch', 13, 0, 'havells'),
('12dfwvwgw3', 'alfred', 13, 0, 'hitchcock'),
('18ggelinv3', 'jhansi', 13, 3000, 'foody'),
('18ggelinv3', 'jhansi', 13, 3001, 'foody'),
('18ggelinv3', 'jhansi', 13, 3002, 'foody'),
('1qwerty345', 'lee', 12, 0, 'bret'),
('1rtclub432', 'Beyonce', 12, 0, 'queen'),
('1s341341rg', 'marshal', 12, 6000, 'matters'),
('1sec15ec00', 'Ramsay', 13, 0, 'psyco'),
('1secplsi44', 'electroman', 13, 3000, 'current'),
('1sfdtape12', 'Kim', 12, 0, 'tape'),
('1sg14cs022', 'page', 11, 5000, 'book'),
('1sg154400c', 'work', 10, 0, NULL),
('1sg15ac333', 'Ezio auditore', 10, 0, 'assasin'),
('1sg15cs099', 'sagar', 10, 0, 'riverbank'),
('1sg15cs333', 'taylor swift', 10, 4001, 'yeezy'),
('1sg15cs696', 'michael', 10, 4001, 'operation'),
('1sg15cs776', 'chance', 10, 4001, 'coloring'),
('1sg15ec003', 'herbert', 10, 0, 'schildt'),
('1sg33g3543', 'heera', 11, 5000, 'diamond'),
('1sg33g3543', 'heera', 11, 5001, 'diamond'),
('1sggrow456', 'altair', 12, 0, 'fooled'),
('1sggwp7565', 'scott', 10, 0, 'bought'),
('1sho1cs337', 'hope', 10, 0, 'plis'),
('1smi003231', 'MIa1', 10, 0, 'android'),
('1sorgyhell', 'walkonwater', 12, 0, 'fly'),
('1srobo3334', 'cynoo', 12, 0, 'guitar'),
('1srow32422', 'Vasant', 12, 0, 'gotcho'),
('1ssccg234f', 'flint', 10, 0, 'fire'),
('1ssclock45', 'Qwarts', 13, 0, 'clock'),
('1sss2345cs', 'jcole', 10, 4000, 'cold'),
('1sss2345cs', 'jcole', 10, 4001, 'cold'),
('1sss2345cs', 'jcole', 10, 4003, 'cold'),
('hp13414243', 'hewlett', 13, 0, 'packard');

--
-- Triggers `member`
--
DROP TRIGGER IF EXISTS `ondeladdmem`;
DELIMITER $$
CREATE TRIGGER `ondeladdmem` AFTER INSERT ON `member`
 FOR EACH ROW DELETE FROM messages WHERE USN=new.usn
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `messages`
--

DROP TABLE IF EXISTS `messages`;
CREATE TABLE IF NOT EXISTS `messages` (
  `USN` varchar(10) NOT NULL,
  `mid` int(4) NOT NULL,
  `mess` varchar(300) NOT NULL,
  `name` varchar(100) NOT NULL,
  `pass` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `outsider`
--

DROP TABLE IF EXISTS `outsider`;
CREATE TABLE IF NOT EXISTS `outsider` (
  `USN` varchar(10) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `CID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `projects`
--

DROP TABLE IF EXISTS `projects`;
CREATE TABLE IF NOT EXISTS `projects` (
  `pname` varchar(30) NOT NULL,
  `pid` int(4) NOT NULL,
  `CID` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `projects`
--

INSERT INTO `projects` (`pname`, `pid`, `CID`) VALUES
('circuit design', 3000, 13),
('Conductance experiment', 3001, 13),
('Phone Circuit Design', 3002, 13),
('data classification', 4000, 10),
('handwriting recognition', 4001, 10),
('DATA ANALYSIS', 4003, 10),
('wing design', 5000, 11),
('black box redesign', 5001, 11),
('ROBOT BODY DESIGN', 6000, 12);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `clubs`
--
ALTER TABLE `clubs`
  ADD PRIMARY KEY (`cid`),
  ADD KEY `mid` (`mid`),
  ADD KEY `mid_2` (`mid`);

--
-- Indexes for table `manager`
--
ALTER TABLE `manager`
  ADD PRIMARY KEY (`MID`),
  ADD KEY `CLUBID` (`CLUBID`),
  ADD KEY `CLUBID_2` (`CLUBID`),
  ADD KEY `CLUBID_3` (`CLUBID`);

--
-- Indexes for table `member`
--
ALTER TABLE `member`
  ADD PRIMARY KEY (`USN`,`ProjectID`),
  ADD KEY `ProjectID` (`ProjectID`),
  ADD KEY `ProjectID_2` (`ProjectID`),
  ADD KEY `CID` (`CID`),
  ADD FULLTEXT KEY `passw` (`passw`);
ALTER TABLE `member`
  ADD FULLTEXT KEY `passw_2` (`passw`);

--
-- Indexes for table `messages`
--
ALTER TABLE `messages`
  ADD PRIMARY KEY (`USN`,`name`),
  ADD KEY `mid` (`mid`);

--
-- Indexes for table `projects`
--
ALTER TABLE `projects`
  ADD PRIMARY KEY (`pid`),
  ADD KEY `pid` (`pid`),
  ADD KEY `CID` (`CID`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `clubs`
--
ALTER TABLE `clubs`
  ADD CONSTRAINT `manidcheck` FOREIGN KEY (`mid`) REFERENCES `manager` (`MID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `manager`
--
ALTER TABLE `manager`
  ADD CONSTRAINT `clubcheck` FOREIGN KEY (`CLUBID`) REFERENCES `clubs` (`cid`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `member`
--
ALTER TABLE `member`
  ADD CONSTRAINT `clb` FOREIGN KEY (`CID`) REFERENCES `clubs` (`cid`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `messages`
--
ALTER TABLE `messages`
  ADD CONSTRAINT `manid` FOREIGN KEY (`mid`) REFERENCES `manager` (`MID`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `projects`
--
ALTER TABLE `projects`
  ADD CONSTRAINT `clubid` FOREIGN KEY (`CID`) REFERENCES `clubs` (`cid`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
