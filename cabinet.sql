SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

CREATE DATABASE IF NOT EXISTS `cabinet` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `cabinet`;

CREATE TABLE `certificat` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `patient` int(10) NOT NULL,
  `medecin` int(10) NOT NULL,
  `motif` varchar(50) NOT NULL,
  `description` varchar(50) NOT NULL,
  `nomcabinet` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

CREATE TABLE `dossiermedical` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `patient` int(10) NOT NULL,
  `vaccin` varchar(10) NOT NULL,
  `dernierevisite` date NOT NULL,
  `traitementencour` varchar(50) NOT NULL,
  `medecin` int(10) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

CREATE TABLE `facture` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `patient` int(10) NOT NULL,
  `medecin` int(10) NOT NULL,
  `nomcabinet` varchar(50) NOT NULL,
  `montant` int(10) NOT NULL,
  `date` date NOT NULL,
  `motif` varchar(50) NOT NULL,
  `paye` tinyint(1) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

CREATE TABLE `fichepatient` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `patient` varchar(50) NOT NULL,
  `nom` varchar(50) NOT NULL,
  `prenom` varchar(50) NOT NULL,
  `inscription` date NOT NULL,
  `adresse` varchar(50) NOT NULL,
  `tel` varchar(10) NOT NULL,
  `mail` varchar(50) NOT NULL,
  `numsecu` int(10) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

CREATE TABLE `fourniseur` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `nom` varchar(50) NOT NULL,
  `tel` varchar(10) NOT NULL,
  `mail` varchar(50) NOT NULL,
  `adresse` varchar(100) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

CREATE TABLE `fourniture` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `fournitures` varchar(50) NOT NULL,
  `medecin` int(10) NOT NULL,
  `date` date NOT NULL,
  `fournisseur` int(10) NOT NULL,
  `quantite` int(10) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

CREATE TABLE `medecin` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `nom` varchar(50) NOT NULL,
  `prenom` varchar(50) NOT NULL,
  `login` varchar(50) NOT NULL,
  `mdp` varchar(50) NOT NULL,
  `spe` varchar(50) NOT NULL,
  `tel` varchar(10) NOT NULL,
  `mail` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

CREATE TABLE `ordonnance` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `medecin` int(10) NOT NULL,
  `patient` int(10) NOT NULL,
  `description` varchar(50) NOT NULL,
  `nomcabinet` varchar(50) NOT NULL,
  `dossiermedical` int(10) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

CREATE TABLE `patient` (
  `id` bigint(20) UNSIGNED NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

CREATE TABLE `rdv` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `dateheure` date NOT NULL,
  `motif` varchar(50) NOT NULL,
  `medecin` int(10) NOT NULL,
  `patient` int(10) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

CREATE TABLE `secretaire` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `nom` varchar(50) NOT NULL,
  `prenom` varchar(50) NOT NULL,
  `login` varchar(50) NOT NULL,
  `mdp` varchar(50) NOT NULL,
  `tel` varchar(10) NOT NULL,
  `mail` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;


ALTER TABLE `certificat`
  ADD UNIQUE KEY `id` (`id`),
  ADD KEY `patient` (`patient`),
  ADD KEY `medecin` (`medecin`);

ALTER TABLE `dossiermedical`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `id` (`id`),
  ADD KEY `patient` (`patient`),
  ADD KEY `medecin` (`medecin`);

ALTER TABLE `facture`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `id` (`id`),
  ADD KEY `medecin` (`medecin`),
  ADD KEY `patient` (`patient`);

ALTER TABLE `fichepatient`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `id` (`id`),
  ADD KEY `patient` (`patient`);

ALTER TABLE `fourniseur`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `id` (`id`);

ALTER TABLE `fourniture`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `id` (`id`),
  ADD KEY `fournisseur` (`fournisseur`),
  ADD KEY `medecin` (`medecin`);

ALTER TABLE `medecin`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `id` (`id`);

ALTER TABLE `ordonnance`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `id` (`id`),
  ADD KEY `dossiermedical` (`dossiermedical`),
  ADD KEY `patient` (`patient`),
  ADD KEY `medecin` (`medecin`);

ALTER TABLE `patient`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `id` (`id`);

ALTER TABLE `rdv`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `id` (`id`),
  ADD KEY `medecin` (`medecin`),
  ADD KEY `patient` (`patient`);

ALTER TABLE `secretaire`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `id` (`id`);


ALTER TABLE `certificat`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT;
ALTER TABLE `dossiermedical`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
ALTER TABLE `facture`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT;
ALTER TABLE `fichepatient`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
ALTER TABLE `fourniseur`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
ALTER TABLE `fourniture`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT;
ALTER TABLE `medecin`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
ALTER TABLE `ordonnance`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
ALTER TABLE `patient`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
ALTER TABLE `rdv`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT;
ALTER TABLE `secretaire`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
