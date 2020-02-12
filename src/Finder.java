import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Finder  {
    /**
     * Поиск групп людей старше определенного возраста.
     *
     * @param groups группы
     * @param targetAge возраст для поиска
     * @return список имен групп из списка групп старше возраста targetAge
     */
    public Set<String> findOldMembers(List<MembersGroup> groups, int targetAge) {
        Set<String> groupsNames = new HashSet<>();

        groupsNames = groups.stream()
                .filter(group -> group.getMembers().stream().anyMatch(member -> member.getAge() > targetAge)).map(MembersGroup::getGroupName)
                .collect(Collectors.toSet());
        return groupsNames;
    }
}
