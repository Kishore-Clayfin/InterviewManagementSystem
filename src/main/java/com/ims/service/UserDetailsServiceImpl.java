//package com.ims.service;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.ims.model.UserDetails;
//import com.ims.repository.IUserDetailsDao;
//
//import lombok.extern.log4j.Log4j2;
//@Log4j2
//@Service
//public class UserDetailsServiceImpl implements IUserDetailsService {
//	@Autowired
//	private IUserDetailsDao iUserDetailsDao;
//
//	@Override
//	public void saveUserDetails(UserDetails userDetails) {
//		iUserDetailsDao.save(userDetails);
//		log.info("new UserDetails added successfully");
//	}
//
//	@Override
//	public List<UserDetails> viewUserDetailsList() {
//		log.info("find all UserDetails from the database");
//		return iUserDetailsDao.findAll();
//	}
//
//	@Override
//	public UserDetails findByUserDetailsId(Integer userDetailsId) {
//		log.info("UserDetails with userDetailsId: "+userDetailsId +" updated");
//		return iUserDetailsDao.findById(userDetailsId).get();
//	}
//
//	@Override
//	public void deleteUserDetails(Integer userDetailsId) {
//		iUserDetailsDao.deleteById(userDetailsId);
//		log.info("UserDetails with userDetailsId "+userDetailsId +" deleted");
//	}
//
//}
