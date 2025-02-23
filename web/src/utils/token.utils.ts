import { jwtDecode } from 'jwt-decode';

export function checkIfJwtIsExpired(token: string) {
  if (!token) return true;

  try {
    const decodedToken = jwtDecode(token);

    if(!decodedToken?.exp) return true;

    const currentTime = Date.now() / 1000; // Convert to seconds
    return decodedToken.exp < currentTime; // Expired if exp is less than current time
  } catch (error) {
    return true;
  }
}
