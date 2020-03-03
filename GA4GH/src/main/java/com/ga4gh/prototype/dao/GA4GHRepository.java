package com.ga4gh.prototype.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ga4gh.prototype.entity.GA4GH;


@Repository("GA4GHRepository")
public interface GA4GHRepository extends JpaRepository<GA4GH, Integer> {

	public GA4GH findById(int id);
	
	public List<GA4GH> findBySequenceName(String seq);
	
	public List<GA4GH> findByGenBankAccn(String seq);
	
	public List<GA4GH> findByRefseqAccn(String seq);
}
