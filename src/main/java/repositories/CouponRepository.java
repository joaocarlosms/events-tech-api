package repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import domain.coupon.Coupon;

public interface CouponRepository extends JpaRepository<Coupon, UUID>{

}
